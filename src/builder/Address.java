package builder;

public class Address {

    private String country;
    private String address;
    private String postalCode;


    //get in maniera classica qui

    // creo la classe AddressBuilder è interna quindi posso accedere
    // alle variabili private, è statica quindi posso accedere dall'esterno
    public static class AddressBuilder {
        //variabile di istanza che il builder andrà a creare
        private final Address address;

        // costruttore privato per evitare
        private AddressBuilder() {
            this.address = new Address();
        }

        // metodo di creazione
        public static AddressBuilder builder() {
            return new AddressBuilder();
        }

        // metodo di chiusura che va a chiudere la creazione
        public Address build() {
            return this.address;
        }

        // metodi set
        public AddressBuilder setCountry(String country) {
            this.address.country = country;
            return this;
        }

        public AddressBuilder setAddress(String address) {
            this.address.address = address;
            return this;
        }

        public AddressBuilder setPostalCode(String postalCode) {
            this.address.postalCode = postalCode;
            return this;
        }

    }


}
