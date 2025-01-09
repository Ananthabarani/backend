//Create an Online Voting System using a ConcurrentMap where:
//Each candidate's name is stored as a key in the ConcurrentMap, and their vote count is the value.
//For example:
//ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();
//Multiple threads simulate voters casting their votes for candidates concurrently.
//The program should handle:
//Adding a new candidate to the map if not already present.
//Incrementing the vote count for an existing candidate safely.
//At the end of voting, display the final vote counts for all candidates.

package Day11.Concurrentmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class OnlineVotingSystem {

    private  ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();

    public void addVote(String candidate) {
       votes.putIfAbsent(candidate, 0);
        votes.put(candidate, votes.get(candidate)+1);
    }
    public void printResults() {
        System.out.println(votes);
        }

        public static void main(String[] args) throws InterruptedException {
            OnlineVotingSystem vs = new OnlineVotingSystem();
            Thread voter1 = new Thread(() -> vs.addVote("Alice"));
            Thread voter2 = new Thread(() -> vs.addVote("Bob"));
            Thread voter3 = new Thread(() -> {
                vs.addVote("Alice");
                vs.addVote("Bob");
                vs.addVote("Charlie");
            });
            voter1.start();
            voter2.start();
            voter3.start();
            voter1.join();
            voter2.join();
            voter3.join();
            vs.printResults();
        }
    }


