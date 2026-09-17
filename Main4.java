interface Confidential {
    // Tagging interface
}

class PublicDocument {
    String name;

    PublicDocument(String name) {
        this.name = name;
    }
}

class PrivateDocument implements Confidential {
    String name;

    PrivateDocument(String name) {
        this.name = name;
    }
}

class SecretDocument implements Confidential {
    String name;

    SecretDocument(String name) {
        this.name = name;
    }
}

public class Main4 {
    public static void main(String[] args) {

        PublicDocument doc1 = new PublicDocument("College Notice");
        PrivateDocument doc2 = new PrivateDocument("Bank Statement");
        SecretDocument doc3 = new SecretDocument("Password File");

        checkConfidential(doc1);
        checkConfidential(doc2);
        checkConfidential(doc3);
    }

    static void checkConfidential(Object document) {

        if (document instanceof Confidential) {
            System.out.println("Document is Confidential.");
        } else {
            System.out.println("Document is NOT Confidential.");
        }
    }
}