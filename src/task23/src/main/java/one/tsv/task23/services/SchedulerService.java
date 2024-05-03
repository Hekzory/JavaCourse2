package one.tsv.task23.services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SchedulerService {
    @Scheduled(cron = "0 0/30 * * * ?")
    public void performBackupAndCreateFiles() {
        // Some backup logic
        System.out.println("Mock: log about backup creation");
    }
}
