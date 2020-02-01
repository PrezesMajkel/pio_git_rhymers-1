package edu.kis.vh.nursery;

/**
 * Lista reprezentująca odliczankę
 */
public class DefaultCountingOutRhymer
{

    private static final int MAX_AMOUNT_OF_ELEMENTS = 12;
    private static final int MAX_INDEX = MAX_AMOUNT_OF_ELEMENTS - 1;
    private final int EMPTY = -1;
    private int amount_elements = -1;
    private int[] numbers = new int[MAX_AMOUNT_OF_ELEMENTS];

    /**
     *  Dodanie nowego elementu
     * @param in wartość nowego elementu
     */
    public void countIn(int in)
    {
        if (!isFull())
            numbers[++amount_elements] = in;
    }

    /**
     *  Sprawdzenie, czy lista jest pust
     * @return TRUE gdy lista jest pust, FALSE gdy lista nie jest pusta
     */
    boolean callCheck()
    {
        return amount_elements == EMPTY;
    }

    /**
     *  Sprawdzenie czy lista jest pełna
     * @return wartość logiczna TRUE, gdy lista jest pełna
     */
    boolean isFull()
    {
        return amount_elements == MAX_INDEX;
    }

    /**
     *  Wyłuskanie wartości ostatniego elementu listy
     * @return wartość ostatniego elementu listy, lub -1 jeżeli lista była pusta
     */
    int peekaboo()
    {
        if (callCheck())
            return EMPTY;
        return numbers[amount_elements];
    }

    /**
     *  Wyłuskanie wartości przedostatniego elementu listy
     * @return wartość przedostatniego elementu listy, lub -1 jeżeli lista była pusta
     */
    public int countOut()
    {
        if (callCheck())
            return EMPTY;
        return numbers[amount_elements--];
    }

    /**
     *  Ilość elementów listy
     * @return ilość elementów listy
     */
    public int getTotal()
    {
        return amount_elements + 1;
    }

}
