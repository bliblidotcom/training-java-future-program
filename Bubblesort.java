public class Bubblesort {

    public static void main(String[] args) {
        Integer howMany = args.length;
        Integer[] inputs = new Integer[howMany];
        for(int i = 0; i < args.length; i++)
        {
            inputs[i] = Integer.parseInt(args[i]);
        }
        inputs = sort(inputs);
        for (int i = 0; i < inputs.length; i++)
        {
            System.out.println(inputs[i]);
        }
    }

    public static Integer[] sort(Integer[] inputs)
    {
        for(int i = 0; i < inputs.length; i++)
        {
            for(int j = 0; j < inputs.length; j++)
            {
                if(inputs[j] > inputs[i]){
                    inputs[j] += inputs[i];
                    inputs[i] = inputs[j]-inputs[i];
                    inputs[j] = inputs[j]-inputs[i];
                }
            }
        }
        
        return inputs;

    }
}
