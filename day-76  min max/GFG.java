class Compute 
{
    
    
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long first=a[0],second=a[0];
        for(int i=1;i<n;i++){
             
            if(first>a[i]){
                first=a[i];
            }
            
        }
        
        for(int i=1;i<n;i++){
            
            
            if(second<a[i]){
                second=a[i];
            }
        }
       return new  pair(first,second);
    }
}
