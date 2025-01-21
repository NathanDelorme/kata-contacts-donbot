package info.dmerej.contacts;

import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Stream;

public class ContactsGenerator {
    public Stream<Contact> generateContacts(int count) {
        Contact[] contacts = new Contact[count];
        for (int i = 0; i < count; i++) {
            contacts[i] = generateContact(i);
        }
        return Arrays.stream(contacts);
    }

    public static Contact generateContact(int count) {
        return new Contact(UUID.randomUUID().toString(), String.format("email-%d", count+1));
    }
}