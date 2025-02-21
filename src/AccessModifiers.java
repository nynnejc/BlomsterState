public class AccessModifiers {
    public String publicVar = "Public Variable";       // Tilgængelig alle steder
    private String privateVar = "Private Variable";    // Kun tilgængelig inde i denne klasse
    protected String protectedVar = "Protected Variable"; // Tilgængelig i samme package & subclasses
    String defaultVar = "Default Variable";            // Kun tilgængelig i samme package

    public void showVariables() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }
}

class Test {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.publicVar);  // ✅ Tilgængelig
        // System.out.println(obj.privateVar); // ❌ Ikke tilgængelig (Compiler Fejl)
        System.out.println(obj.protectedVar); // ✅ Accessible (samme package)
        System.out.println(obj.defaultVar);   // ✅ Accessible (samme package)

        obj.showVariables(); // ✅ Har adgang til privateVar indenfor den samme klasse
    }
}
