public class Deadline extends Task {
    private String dueTime;

    public Deadline(String taskInfo, String dueTime) {
        super(taskInfo);
        this.dueTime = dueTime;
    }

    @Override
    public String toString() {
        // ternary operator adapted from John McMonigle https://github.com/nus-cs2113-AY2122S2/ip/pull/56
        // rewrote return statement based on Clarence Chua Ying How's implementation https://github.com/nus-cs2113-AY2122S2/ip/pull/84
        String completion = (super.isDone() ? "X" : " ");
        return String.format("[D] [%s] %s (by: %s)", completion, super.getTaskInfo(), dueTime);
    }

}
