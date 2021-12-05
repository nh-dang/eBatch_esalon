package jp.co.plussum.ebatch.job.type;

import java.util.EnumSet;

public enum JobID {

    JOB0001(50),
    ;

    public final Integer uid;

    JobID(Integer uid) {
        this.uid = uid;
    }

    public static JobID atUid(Integer uid) {
        return EnumSet.allOf(JobID.class).stream()
                .filter(command -> command.uid == uid)
                .findFirst()
                .orElse(null);
    }
}
