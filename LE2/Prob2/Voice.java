public class Voice {
    // Method to prepare the voice
    public void prepareVoice() {
        System.out.println("Preparing voice...");
    }

    // Method to hear the voice
    public void hear() {
        System.out.println("Hearing the voice...");
    }

    // Template method that enforces the correct order of calling methods
    public void templateMethod() {
        prepareVoice();  // First, prepare the voice
        hear();          // Then, hear the voice
    }

    public static void main(String[] args) {
        // Create an instance of Voice and invoke templateMethod
        Voice voice = new Voice();
        voice.templateMethod();
    }
}
