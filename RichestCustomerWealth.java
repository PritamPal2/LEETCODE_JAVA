class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int richest = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++) {
            int sum = 0;
            for(int j=0;j<accounts[0].length;j++) {
                sum += accounts[i][j]; 
            }
            if(sum > richest) richest = sum; 
        }

        return richest;
    }
    
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{2,8,7},{1,9,5}};
        System.err.println(maximumWealth(accounts));
    }
}