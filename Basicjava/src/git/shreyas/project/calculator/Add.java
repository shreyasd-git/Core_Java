package git.shreyas.project.calculator;

public class Add implements Operate{

	@Override
	public Double getResult(Double... numbers) {
		double sum = 0.0;
		
		for (Double num : numbers) {
			sum += num;
		}
		
		return sum;
	}
	

}
