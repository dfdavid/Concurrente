package paq;

import java.util.concurrent.CyclicBarrier;

/**
 * @author tatacalu
 * 
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final int ROWS = 10_000;
        final int NUMBERS = 1_000;
        final int SEARCH = 3;
        final int PARTICIPANTS = 5;
        final int LINES_PARTICIPANT = 2_000;

        MatrixMock mock = new MatrixMock(ROWS, NUMBERS, SEARCH);
        Results results = new Results(ROWS);
        Grouper grouper = new Grouper(results);

        CyclicBarrier barrier = new CyclicBarrier(PARTICIPANTS, grouper);
        Searcher searchers[] = new Searcher[PARTICIPANTS];
        for (int i = 0; i < PARTICIPANTS; i++) {
            searchers[i] = new Searcher(i * LINES_PARTICIPANT, (i * LINES_PARTICIPANT) + LINES_PARTICIPANT, mock, results, SEARCH, barrier);
            Thread thread = new Thread(searchers[i]);
            thread.start();
        }
        
        System.out.printf("Main: The main thread has finished.\n");
    }
}
