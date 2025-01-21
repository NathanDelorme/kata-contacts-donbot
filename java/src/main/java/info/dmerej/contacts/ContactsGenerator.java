package info.dmerej.contacts;

import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContactsGenerator {
    public Stream<Contact> generateContacts(int count) {
        return IntStream.range(0, count)
                .mapToObj(this::generateContact);
    }

    public Contact generateContact(int count) {
        return new Contact(UUID.randomUUID().toString(), String.format("email-%d", count+1));
    }
}