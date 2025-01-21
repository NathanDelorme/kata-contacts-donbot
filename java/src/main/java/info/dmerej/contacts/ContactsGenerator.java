package info.dmerej.contacts;

import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Stream;

public class ContactsGenerator {
    public Stream<Contact> generateContacts(int count) {
        Contact[] contacts = new Contact[] {};
        for (int i = 1; i <= count; i++) {
            contacts = Arrays.copyOf(contacts, contacts.length + 1);
            contacts[contacts.length - 1] = generateContact(i);
        }
        return Arrays.stream(contacts);
    }

    public static Contact generateContact(int count) {
        return new Contact(UUID.randomUUID().toString(), String.format("email-%d", count));
    }
}
