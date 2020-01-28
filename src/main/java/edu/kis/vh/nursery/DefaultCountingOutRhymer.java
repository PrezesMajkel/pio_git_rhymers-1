package edu.kis.vh.nursery;


public class DefaultCountingOutRhymer
{

    public static final int MAX_AMOUNT_OF_ELEMENTS = 12;
    public int EMPTY = -1;
    public int AMOUNT_ELEMENTS = -1;
    private int[] NUMBERS = new int[MAX_AMOUNT_OF_ELEMENTS];

    public void countIn(int in)
    {
        if (!isFull())
            NUMBERS[++AMOUNT_ELEMENTS] = in;
    }

    public boolean callCheck()
    {
        return AMOUNT_ELEMENTS == -1;
    }

    public boolean isFull()
    {
        return AMOUNT_ELEMENTS == 11;
    }

    protected int peekaboo()
    {
        if (callCheck())
            return EMPTY;
        return NUMBERS[AMOUNT_ELEMENTS];
    }

    public int countOut()
    {
        if (callCheck())
            return EMPTY;
        return NUMBERS[AMOUNT_ELEMENTS--];
    }

    public int getTotal()
    {
        return AMOUNT_ELEMENTS;
    }

    public int setTotal(int total)
    {
        this.AMOUNT_ELEMENTS = total;
        return this.AMOUNT_ELEMENTS;
    }
}
