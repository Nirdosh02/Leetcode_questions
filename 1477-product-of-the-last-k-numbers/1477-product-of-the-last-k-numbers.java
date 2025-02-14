class ProductOfNumbers {
    private ArrayList<Integer> arr = new ArrayList<>();
    private int top;
    public ProductOfNumbers() {
        this.arr=new ArrayList<>();
        this.top=0;
    }
    
    public void add(int num) {
        arr.add(num);
        top++;
    }
    
    public int getProduct(int k) {
        int pro = 1;
        for(int i=1;i<=k; i++){
            pro*=arr.get(top-i);
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */