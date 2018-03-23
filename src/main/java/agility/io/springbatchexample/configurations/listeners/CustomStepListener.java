package agility.io.springbatchexample.configurations.listeners;

import agility.io.springbatchexample.tasks.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class CustomStepListener implements StepExecutionListener {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    @Override
    public void beforeStep(StepExecution stepExecution) {

        logger.info("StepExecutionListener - beforeStep");
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {

        logger.info("StepExecutionListener - afterStep");

        return null;
    }
}