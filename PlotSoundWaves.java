public class PlotSoundWaves {
	
	public static void main(String[] args) {
		StdDraw.setYscale(-1.0, 1.0);
		double[] hi;
		hi = PlayThatTuneDeluxe.tone(880, .01);
		StdStats.plotPoints(hi);
	}
}