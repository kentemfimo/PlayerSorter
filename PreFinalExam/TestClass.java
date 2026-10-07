public class TestClass {

    public static void displayHeader() {
        System.out.printf("%-8s %-15s %-15s %s%n", "ID", "NAME", "TEAM", "SCORE");
        System.out.println("----------------------------------------------------------");
    }

    public static void displayPlayers(Player[] players) {
        displayHeader();
        for (Player p : players) {
            System.out.println(p);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("P001", "Alice Cruz", "Blue Dragons", 88.5),
            new Player("P002", "Ben Santos", "Red Phoenix", 95.0),
            new Player("P003", "Carla Reyes", "Green Vipers", 72.25),
            new Player("P004", "Daniel Lim", "Blue Dragons", 91.75),
            new Player("P005", "Elena Garcia", "Yellow Thunder", 84.0),
            new Player("P006", "Frank Rivera", "Red Phoenix", 95.0),
            new Player("P007", "Grace Torres", "Green Vipers", 79.5),
            new Player("P008", "Henry Mendoza", "Yellow Thunder", 68.75)
        };

        System.out.println("=== PLAYERS BEFORE SORTING ===");
        displayPlayers(players);

        SortingAlgorithm.bubbleSort(players);

        System.out.println("=== PLAYERS SORTED (HIGHEST TO LOWEST) ===");
        displayPlayers(players);

        System.out.println("=== TOP 3 PLAYERS ===");
        displayHeader();
        for (int i = 0; i < 3 && i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i]);
        }
    }
}
