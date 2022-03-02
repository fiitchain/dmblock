// Meno študenta:
// Blockchain by mal na uspokojenie funkcií udržiavať iba obmedzené množstvo uzlov
// Nemali by ste mať všetky bloky pridané do blockchainu v pamäti  
// pretože by to spôsobilo pretečenie pamäte.
import java.util.ArrayList;
import java.util.HashMap;

public class Blockchain {
    public static final int CUT_OFF_AGE = 12;

    // všetky potrebné informácie na spracovanie bloku v reťazi blokov
    private class BlockNode {
        public Block b;
        public BlockNode parent;
        public ArrayList<BlockNode> children;
        public int height;
        // utxo pool na vytvorenie nového bloku na vrchu tohto bloku
        private UTXOPool uPool;

        public BlockNode(Block b, BlockNode parent, UTXOPool uPool) {
            this.b = b;
            this.parent = parent;
            children = new ArrayList<BlockNode>();
            this.uPool = uPool;
            if (parent != null) {
                height = parent.height + 1;
                parent.children.add(this);
            } else {
                eight = 1;
            }
        }
        public UTXOPool getUTXOPoolCopy() {
            return new UTXOPool(uPool);
         }
    }
    /**
     * vytvor prázdny blockchain iba s Genesis blokom. Predpokladajme, že
     * {@code genesisBlock} je platný blok
     */
    public Blockchain(Block genesisBlock) {
        // IMPLEMENTOVAŤ
    }

    /** Získaj maximum height blok */
    public Block getBlockAtMaxHeight() {
        // IMPLEMENTOVAŤ
    }

    /** Získaj UTXOPool na ťaženie nového bloku na vrchu max height blok */
    public UTXOPool getUTXOPoolAtMaxHeight() {
        // IMPLEMENTOVAŤ
    }

    /** Získaj pool transakcií na vyťaženie nového bloku */
    public TransactionPool getTransactionPool() {
        // IMPLEMENTOVAŤ
    }

    /**
     * Pridaj {@code block} do blockchainu, ak je platný. Kvôli platnosti by mali
     * byť všetky transakcie platné a blok by mal byť na
     * {@code height > (maxHeight - CUT_OFF_AGE)}.
     *
     * Môžete napríklad vyskúšať vytvoriť nový blok nad blokom Genesis (výška bloku
     * 2), ak height blockchainu je {@code <=
     * CUT_OFF_AGE + 1}. Len čo {@code height > CUT_OFF_AGE + 1}, nemôžete vytvoriť
     * nový blok vo výške 2.
     *
     * @return true, ak je blok úspešne pridaný
     */
    public boolean blockAdd(Block block) {
        // IMPLEMENTOVAŤ
    }

    /** Pridaj transakciu do transakčného poolu */
    public void transactionAdd(Transaction tx) {
        // IMPLEMENTOVAŤ
    }
}