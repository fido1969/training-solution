package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEventNames() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(meetingRooms.get(i).getName());
            }
        }
    }

    public void printAreas() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            System.out.println(meetingRooms.get(i).getName() + ", " + meetingRooms.get(i).getWidth()
                    + " m ," + meetingRooms.get(i).getLength() + " m , " + meetingRooms.get(i).getArea() + " m2");
        }
    }

    public void printMeeetingRoomsWithName(String name) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getName().equals(name)) {
                System.out.println((name));
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        String partIn = part.toLowerCase();
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getName().toLowerCase().contains(partIn)) {
                System.out.println(meetingRooms.get(i).getWidth() + " m , " +
                        meetingRooms.get(i).getLength() + " m , " + meetingRooms.get(i).getArea() + " m2");
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getArea() > area) {
                System.out.println(meetingRooms.get(i).getName() + ", " + meetingRooms.get(i).getWidth()
                        + " m ," + meetingRooms.get(i).getLength() + " m , " + meetingRooms.get(i).getArea() + " m2");
            }
        }
    }
}











