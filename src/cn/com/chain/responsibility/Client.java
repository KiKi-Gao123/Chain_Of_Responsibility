package cn.com.chain.responsibility;

public class Client {
    public static void main(String[] args) {
        BigLeader objDirector,objManager,objGeneralManager;

        objDirector = new Director("王主任");
        objManager = new Manager("赵经理");
        objGeneralManager = new GeneralManager("高总经理");

        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objGeneralManager);

        LeaveRequest lr1 = new LeaveRequest("张三",2);
        objDirector.handleRequest(lr1);

        LeaveRequest lr2 = new LeaveRequest("李四",5);
        objDirector.handleRequest(lr2);

        LeaveRequest lr3 = new LeaveRequest("王五",15);
        objDirector.handleRequest(lr3);

        LeaveRequest lr4= new LeaveRequest("赵六",45);
        objDirector.handleRequest(lr4);
    }
}
