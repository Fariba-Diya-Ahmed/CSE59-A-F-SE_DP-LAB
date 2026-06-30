interface OptimizableModel{
    void quantize();
}

class ResNet18 implements OptimizableModel{
    public void quantize(){
        System.out.println("Applying quantization to ResNet18 model");
    }
}

class MobileNet implements OptimizableModel{
    public void quantize(){
        System.out.println("Applying dynamic quantization to MobileNet model");
    }
}

class InferenceEngine{
    public void quantizeModel(OptimizableModel model){
        model.quantize();
    }
}

public class Main4 {
    public static void main(String args[]){
        InferenceEngine engine = new InferenceEngine();

        ResNet18 resnet = new ResNet18();

        MobileNet m = new MobileNet();

        engine.quantizeModel(resnet);
        engine.quantizeModel(m);
    }
}
