package jp.co.plussum.ebatch.job.core;

import jp.co.plussum.ebatch.job.type.JobID;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface Job {
	JobID value();
}
