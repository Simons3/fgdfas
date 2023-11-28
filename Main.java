public class FieldBiologist {
    protected String name;
    private int age;
    private String researchTopic;

    public FieldBiologist(String name, int age, String researchTopic) {
        this.name = name;
        this.age = age;
        this.researchTopic = researchTopic;
    }

    public void collectData() {
        System.out.println("Field biologist " + name + " is collecting data on " + researchTopic + ".");
        // code to collect data
    }

    public void analyzeData() {
        System.out.println("Field biologist " + name + " is analyzing the collected data.");
        // code to analyze data
    }

    protected void publishResearch() {
        System.out.println("Field biologist " + name + " is publishing the research on " + researchTopic + ".");
        // code to publish research
    }
}