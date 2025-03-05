// Meno študenta:
import java.util.ArrayList;
import java.util.Set;

/* TrustedNode označuje uzol, ktorý dodržuje pravidlá (nie je byzantský) */
public class TrustedNode implements Node {

    public TrustedNode(double p_graph, double p_byzantine, double p_txDistribution, int numRounds) {
        // IMPLEMENTOVAŤ
    }

    public void followeesSet(boolean[] followees) {
        // IMPLEMENTOVAŤ
    }

    public void pendingTransactionSet(Set<Transaction> pendingTransactions) {
        // IMPLEMENTOVAŤ
    }

    public Set<Transaction> followersSend() {
        // IMPLEMENTOVAŤ
    }

    public void followeesReceive(ArrayList<Integer[]> candidates) {
        // IMPLEMENTOVAŤ
    }
}
