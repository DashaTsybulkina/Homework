package robot;

import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.hands.ToshibaHand;
import robot.heads.SamsungHead;
import robot.heads.SonyHead;
import robot.heads.ToshibaHead;
import robot.legs.SamsungLeg;
import robot.legs.ToshibaLeg;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        ArrayList<Robot> robots = new ArrayList<>();
        robots.add(new Robot(new SamsungHead(200), new SonyHand(123), new ToshibaLeg(321)));
        robots.add(new Robot(new SonyHead(634), new ToshibaHand(140), new SamsungLeg(235)));
        robots.add(new Robot(new ToshibaHead(620), new SamsungHand(128), new ToshibaLeg(726)));
        for (Robot robot : robots) {
            robot.action();
        }
        int maxCost = 0;
        Robot robotMaxCost = null;
        for (Robot robot : robots) {
            if (robot.getPrice() > maxCost) {
                maxCost = robot.getPrice();
                robotMaxCost = robot;
            }
        }
        System.out.println("Самый дорогой робот: " + robotMaxCost.toString());
    }
}
