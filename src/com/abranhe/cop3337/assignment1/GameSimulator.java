/**
 * This is free and unencumbered software released into the public domain.
 * <p>
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 * <p>
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 * <p>
 * For more information, please refer to <http://unlicense.org>
 */

package com.abranhe.cop3337.assignment1;

/**
 * This class models a game of dies, allows you to run multiple
 * simulations, and get the wining and losses total.
 * Also it calculate the wining percentage.
 * For more details go to https://projects.abranhe.com/cop3337;
 *
 * @author Carlos Abraham
 */

public class GameSimulator {
    private int tries;
    private Die d1, d2;
    private int wins;
    private int losses;

    /**
     * Construct a simulator object for die games.
     *
     * @param numSides the number of sides on the die.
     * @param numTries the number of times to run the simulation.
     */
    public GameSimulator(int numSides, int numTries) {
        this.d1 = new Die(numSides);
        this.d2 = new Die(numSides);
        this.tries = numTries;
    }

    /**
     * Runs a single die simulation. One die is cast 4 times. If a six appears in
     * those 4 casts, then wins is incremented, otherwise losses is incremented.
     * Simulation is run according to the number of tries set.
     */
    public void runSingleDieSimulation() {
        final int casts = 4;
        final int target = 6;

        for (int i = 0; i < this.tries; i++) {
            boolean victory = false;

            for (int j = 0; j < casts; j++) {
                if (this.d1.cast() == target) {
                    this.wins++;
                    victory = true;
                    break;
                }
            }

            if (!victory) {
                this.losses++;
            }
        }
    }

    /**
     * Runs a double die simulation. A pair of dice are cast 24 times. If a
     * double-six appears in those 24 casts, then wins is incremented, otherwise
     * losses is incremented. The simulation is run according to the number of tries
     * set.
     */
    public void runDoubleDieSimulation() {
        final int casts = 24;
        // Set up an array as the target to be able
        // to change the values easily.
        final int[] targets = { 6, 6 };

        // Since we have 2 for-loops the time complexity
        // for the worst-case scenario will be O(n^2).
        for (int i = 0; i < this.tries; i++) {
            boolean victory = false;

            for (int j = 0; j < casts; j++) {
                if (this.d1.cast() == targets[0] && this.d2.cast() == targets[1]) {
                    this.wins++;
                    victory = true;
                    break;
                }
            }

            if (!victory) {
                this.losses++;
            }
        }
    }

    /**
     * Returns the % of wins.
     *
     * @return the % of wins.
     */
    public double getWinPercent() {
        return (double) (wins) / (wins + losses);
    }

    /**
     * Returns the number of wins.
     *
     * @return the number of wins.
     */
    public int getWins() {
        return wins;
    }

    /**
     * Returns the number of losses.
     *
     * @return the number of losses.
     */
    public int getLosses() {
        return losses;
    }
}
