package dims.common.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class MappingTestsTask extends DefaultTask {
    @Input
    String environment = "default";

    @TaskAction
    void run() {
        System.out.println("environment = " + environment);
    }

    @Override
    public String getGroup() {
        return "verification";
    }
}
