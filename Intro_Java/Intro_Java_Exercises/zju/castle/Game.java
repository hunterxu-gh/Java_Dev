package Intro_Java_Exercises.zju.castle;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private HashMap<String, Handler> handlers = new HashMap<String, Handler>();
        
    public Game() 
    {
        handlers.put("bye", new HanderBye())
        //handlers.put("go", new HanderGo());
        createRooms();
    }

    public void play() {
        while ( true ) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            Handler hander = handlers.get(word[0])

            String value = "";
            if (words.length > 1)
                value = words[1];

            if ( handler != null ) {
                handler.doCmd(word[1]);
                if (hander.isBye())
                    break;
            }
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
        //	初始化房间的出口
        outside.setExits("east", lobby);
        outside.setExits("south", study);
        outside.setExits("west", pub);
        lobby.setExits("west", outside);
        pub.setExits("east", outside);
        study.setExits("north",outside);
        study.setExits("east",bedroom);
        bedroom.setExits("west", study);
        lobby.setExits("up", pub);
        pub.setExits("down", lobby);

        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        /* System.out.println("现在你在" + currentRoom);
        System.out.print("出口有：");
        if(currentRoom.northExit != null)
            System.out.print("north ");
        if(currentRoom.eastExit != null)
            System.out.print("east ");
        if(currentRoom.southExit != null)
            System.out.print("south ");
        if(currentRoom.westExit != null)
            System.out.print("west ");
        System.out.println(); */
        // 消除代码复制
        showPrompt();
    }

    // 以下为用户命令

    private void printHelp() 
    {
        System.out.print("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
    }

    private void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);
        

        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }

    public void showPrompt() {
        System.out.println("你在" + currentRoom);
        System.out.print("出口有: ");
        System.out.println(currentRoom.getExitDesc());
        System.out.println();
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Game game = new Game();
		game.printWelcome();

        
        }
        
        System.out.println("感谢您的光临。再见！");
        in.close();
	}

}
