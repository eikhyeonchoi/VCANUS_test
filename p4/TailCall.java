package p4;

import java.util.stream.Stream;

public interface TailCall {
    TailCall apply();

    default boolean isComplete() {
        return false;
    }

    default int result() {
        throw new Error("not implemented");
    }

    default int invoke() {
        return Stream.iterate(this, TailCall::apply)
                .filter(TailCall::isComplete)
                .findFirst()
                .get()
                .result();
    }
}
