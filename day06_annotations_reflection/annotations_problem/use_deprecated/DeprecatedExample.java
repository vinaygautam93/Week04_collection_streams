package com.day06_annotations_reflection.annotations_problem.use_deprecated;

// Legacy class with an outdated method
class LegacyAPI {

    // Marking oldFeature() as deprecated
    @Deprecated
    void oldFeature() {
        System.out.println("This is an old feature and should not be used.");
    }

    // New recommended method
    void newFeature() {
        System.out.println("This is the new and improved feature!");
    }
}

// Testing the deprecated method warning
public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();  // Compiler might show a warning
        api.newFeature();
    }
}
