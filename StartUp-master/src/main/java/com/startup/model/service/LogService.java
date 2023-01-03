package com.startup.model.service;

import com.startup.model.entity.Log;
import com.startup.model.repository.CRUDRepository;

import java.util.List;

public class LogService {
    private static final LogService logService = new LogService();

    private LogService() {
    }

    public static LogService getLogService() {
        return logService;
    }

    public Log save(Log log) throws Exception {
        try (CRUDRepository<Log, Long> logRepository = new CRUDRepository<>()) {
            log = logRepository.insert(log);
            System.out.printf("Automation [LOG] Action : [%s] on %s [%s] at [%s] \n",
                    log.getAction(),
                    log.getDbTable(),
                    log.getData(),
                    log.getActionDateTime().toString());
            return log;
        }
    }


    public List<Log> findAll() throws Exception {
        return null;
    }

}
