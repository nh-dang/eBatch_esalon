package jp.co.plussum.ebatch.job;

import jp.co.plussum.ebatch.job.core.ClientRequest;

public interface JobRunner {
    default void prepare() {
    }

    void execute(ClientRequest request) throws Exception;

    default void onComplete() {
    }

    default void onError(Throwable throwable) {
    }
}
