package asg2client.client;

import asg2client.service.Asg2ServiceService;
import asg2client.service.Asg2Service;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class asg2_ServiceClient {

    public static void main(String [] args) throws ParseException {

        Asg2ServiceService a2ss = new Asg2ServiceService();
        Asg2Service a2s = a2ss.getAsg2ServicePort();

        PrintStream cout = System.out;
        Scanner cin = new Scanner(System.in);


        cout.println("Enter L to list, B to book, E to edit, Q to quit");
        cout.flush();
        String input = cin.nextLine();
        boolean quit = false;
        ArrayList<String> ord = new ArrayList<String>();
        while (!quit) {
            int c = input.charAt(0);
            switch (c) {
                //BOOKING

                case 'b':
                case 'B':
                    String uin = "";
                    uin = "";
                    cout.println("Enter Customer No: ");
                    String cno = cin.nextLine();
                    float commission = 0;
                    List<String> segmentList = new ArrayList<String>();
                    int segmentCounter = 0;
                    int To = 0;
                    Date date = new Date();
                    while(!uin.equals("B") && !uin.equals("b") && !uin.equals("c") && !uin.equals("C")){
                        cout.println("Enter Segment in origin,destination,date,price,mode format: ");

                        String ci = cin.nextLine();

                        int newFrom;
                        Date newDate;
                        if (segmentCounter == 0) {
                            String[] values = ci.split(",");
                            To = Integer.parseInt(values[1]);
                            date = new SimpleDateFormat("dd/MM/yyyy").parse(values[2]);
                            segmentCounter++;
                            segmentList.add(ci);
                        } else if (segmentCounter>0){
                            String[] valuesNew = ci.split(",");
                            newFrom = Integer.parseInt(valuesNew[0]);
                            newDate = new SimpleDateFormat("dd/MM/yyyy").parse(valuesNew[2]);
                            if ((newFrom == To) && (newDate.compareTo(date)>=0)){
                                //execute
                                segmentCounter++;
                                segmentList.add(ci);
                                //add current segment to oldTo and oldDate
                                //                                cout.println(To); cout.println(date);
                                To = Integer.parseInt(valuesNew[1]);; date = newDate;
                                //                                cout.println(To); cout.println(date);

                            } else if (newFrom != To){
                                cout.println(String.format("Segment Not Added. Make sure your Origin matches your previous Destination: %o", To));
                            } else if (newDate.compareTo(date)<0){
                                cout.println("Segment Not Added. Make sure your dates are chronological!");
                            }
                        }

                        cout.println("Enter N for next segment, B to book, C to cancel");
                        uin = cin.nextLine();
                    }
                    if(uin.equals("c") || uin.equals("C")){
                        cout.println("Successfully Cancelled");
                    }
                    else if(uin.equals("B") || uin.equals("b")){
                        List<String> p = a2s.book(cno, commission, segmentList);
                        if (p.get(0).equals("0")){
                            cout.println(String.format("Your trip could not be confirmed because there was a transaction error"));
                        } else {
                            cout.println(String.format("You're reservations are confirmed. Your trip id is %s and the total price of the trip is $%s", p.get(1), p.get(0)));
                        }
                    }
                    break;

                //Listing
                case 'L':
                case 'l':
                    cout.println("Enter Customer No: ");
                    cout.flush();
                    //String cno;
                    cno = cin.nextLine();
                    List<String> l = (List<String>) a2s.getCustomerTrips(cno);
                    for (int i = 0; i < l.size(); i++) {
                        String tid = l.get(i);
                        //  cout.println(tid);
                        List<String> td = a2s.List(tid);
                        cout.println(String.format("Start Trip: %s", tid));
                        for (String s : td) {
                            cout.println(s);
                        }
                        cout.println(String.format("End Trip: %s", tid));
                    }
                    break;

                case 'E':
                case 'e':
                    cout.println("Enter TripID: ");
                    cout.flush();
                    //String cno;
                    String tidE = cin.nextLine();
                    cout.println("Enter Origin: ");
                    cout.flush();
                    //String cno;
                    String oidE = cin.nextLine();
                    String lE = a2s.List1(tidE, oidE);
                    if (lE.equals("0")){
                        cout.println("No Trip ID's with such origin");
                    } else {
                        cout.println(String.format("The segment is %s", lE));
                        cout.println("Price (A value of 0 will remove the segment): ");
                        cout.flush();
                        String priceE = cin.nextLine();
                        int edit = a2s.edit(tidE, oidE, priceE);
                        cout.println(String.format("Your reservations for trip id %s is updated and " +
                                "the total price of the trip is $%s", tidE, edit));
                    }
                    break;
                default:
                    quit = true;
            }
            if (!quit) {
                cout.println("Enter L to list, B to book, E to edit, Q to quit");
                cout.flush();
                input = cin.nextLine();
            }
        }
    }

}
