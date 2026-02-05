class CountDivBy7 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i<=100; i++)
        {
            if(i % 7 == 0){
                count++;
            }
        }

        System.err.println("count = " + count);
    }
    
}


/*Flow in simple words

Start with count = 0

Check each number from 1 to 100

If divisible by 7 → increase count

After loop, print count */