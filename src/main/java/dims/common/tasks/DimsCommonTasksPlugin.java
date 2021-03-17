package dims.common.tasks;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

public class DimsCommonTasksPlugin implements Plugin<Project> {
    public void apply(Project project) {
        // Register all of the common tasks here
        project.getTasks().register("mappingTests", MappingTestsTask.class);
    }
}
