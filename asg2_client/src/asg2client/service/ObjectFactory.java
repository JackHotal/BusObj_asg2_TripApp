
package asg2client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the asg2client.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHelloWorldFrom_QNAME = new QName("http://asg2/", "sayHelloWorldFrom");
    private final static QName _SayHelloWorldFromResponse_QNAME = new QName("http://asg2/", "sayHelloWorldFromResponse");
    private final static QName _List_QNAME = new QName("http://asg2/", "List");
    private final static QName _List1Response_QNAME = new QName("http://asg2/", "List1Response");
    private final static QName _Edit_QNAME = new QName("http://asg2/", "edit");
    private final static QName _ListResponse_QNAME = new QName("http://asg2/", "ListResponse");
    private final static QName _BookResponse_QNAME = new QName("http://asg2/", "bookResponse");
    private final static QName _EditResponse_QNAME = new QName("http://asg2/", "editResponse");
    private final static QName _GetCustomerTrips_QNAME = new QName("http://asg2/", "getCustomerTrips");
    private final static QName _Book_QNAME = new QName("http://asg2/", "book");
    private final static QName _GetCustomerTripsResponse_QNAME = new QName("http://asg2/", "getCustomerTripsResponse");
    private final static QName _List1_QNAME = new QName("http://asg2/", "List1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: asg2client.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link List1 }
     * 
     */
    public List1 createList1() {
        return new List1();
    }

    /**
     * Create an instance of {@link ListResponse }
     * 
     */
    public ListResponse createListResponse() {
        return new ListResponse();
    }

    /**
     * Create an instance of {@link BookResponse }
     * 
     */
    public BookResponse createBookResponse() {
        return new BookResponse();
    }

    /**
     * Create an instance of {@link EditResponse }
     * 
     */
    public EditResponse createEditResponse() {
        return new EditResponse();
    }

    /**
     * Create an instance of {@link GetCustomerTrips }
     * 
     */
    public GetCustomerTrips createGetCustomerTrips() {
        return new GetCustomerTrips();
    }

    /**
     * Create an instance of {@link List1Response }
     * 
     */
    public List1Response createList1Response() {
        return new List1Response();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link GetCustomerTripsResponse }
     * 
     */
    public GetCustomerTripsResponse createGetCustomerTripsResponse() {
        return new GetCustomerTripsResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link SayHelloWorldFromResponse }
     * 
     */
    public SayHelloWorldFromResponse createSayHelloWorldFromResponse() {
        return new SayHelloWorldFromResponse();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link SayHelloWorldFrom }
     * 
     */
    public SayHelloWorldFrom createSayHelloWorldFrom() {
        return new SayHelloWorldFrom();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "sayHelloWorldFrom")
    public JAXBElement<SayHelloWorldFrom> createSayHelloWorldFrom(SayHelloWorldFrom value) {
        return new JAXBElement<SayHelloWorldFrom>(_SayHelloWorldFrom_QNAME, SayHelloWorldFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFromResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "sayHelloWorldFromResponse")
    public JAXBElement<SayHelloWorldFromResponse> createSayHelloWorldFromResponse(SayHelloWorldFromResponse value) {
        return new JAXBElement<SayHelloWorldFromResponse>(_SayHelloWorldFromResponse_QNAME, SayHelloWorldFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "List")
    public JAXBElement<List> createList(List value) {
        return new JAXBElement<List>(_List_QNAME, List.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "List1Response")
    public JAXBElement<List1Response> createList1Response(List1Response value) {
        return new JAXBElement<List1Response>(_List1Response_QNAME, List1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "ListResponse")
    public JAXBElement<ListResponse> createListResponse(ListResponse value) {
        return new JAXBElement<ListResponse>(_ListResponse_QNAME, ListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "bookResponse")
    public JAXBElement<BookResponse> createBookResponse(BookResponse value) {
        return new JAXBElement<BookResponse>(_BookResponse_QNAME, BookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "editResponse")
    public JAXBElement<EditResponse> createEditResponse(EditResponse value) {
        return new JAXBElement<EditResponse>(_EditResponse_QNAME, EditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerTrips }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "getCustomerTrips")
    public JAXBElement<GetCustomerTrips> createGetCustomerTrips(GetCustomerTrips value) {
        return new JAXBElement<GetCustomerTrips>(_GetCustomerTrips_QNAME, GetCustomerTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerTripsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "getCustomerTripsResponse")
    public JAXBElement<GetCustomerTripsResponse> createGetCustomerTripsResponse(GetCustomerTripsResponse value) {
        return new JAXBElement<GetCustomerTripsResponse>(_GetCustomerTripsResponse_QNAME, GetCustomerTripsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asg2/", name = "List1")
    public JAXBElement<List1> createList1(List1 value) {
        return new JAXBElement<List1>(_List1_QNAME, List1 .class, null, value);
    }

}
