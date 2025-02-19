package practize11.n1;

import java.util.Date;

public class DevOps {
    private String surname;
    private Date receiveTask;
    private Date solveTask;

    public DevOps(String surname, Date receiveTask) {
        this.surname = surname;
        this.receiveTask = receiveTask;
        this.solveTask = null;
    }


    public void setSolveTask(Date endDate) {
        this.solveTask = endDate;
    }

    @Override
    public String toString() {
        return "Developer{surname='" + surname + "', " +
                "startDate=" + receiveTask + ", endDate=" + solveTask + "}\n";
    }
}
