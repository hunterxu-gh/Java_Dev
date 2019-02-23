package Intro_Java_Exercises.zju.castle;

import java.util.HashMap;

public class Room {
    private String description;
/*     private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit; */
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) 
    {
        this.description = description;
    }

/*     public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    } */
    public void setExits(String dir, Room room) {
        exits.put(dir, room);
    }

    @Override
    public String toString()
    {
        return description;
    }

    public String getExitDesc() {
        StringBuffer sb = new StringBuffer();
        for (String dir : exits.keySet()) {
            sb.append(dir);
            sb.append(' ');
        }
        /* if (northExit != null)
            sb.append("north ");
        if (northExit != null)
            sb.append("south ");
        if (northExit != null)
            sb.append("east ");
        if (northExit != null)
            sb.append("west "); */
        return sb.toString();
    }

    public Room getExit(String direction) {
        // Room ret = null;
        // ret = exits.get(direction);
        /* if(direction.equals("north")) {
            ret = northExit;
        }
        if(direction.equals("east")) {
            ret = eastExit;
        }
        if(direction.equals("south")) {
            ret = southExit;
        }
        if(direction.equals("west")) {
            ret = westExit;
        } */
        return exits.get(direction);
    }
}
