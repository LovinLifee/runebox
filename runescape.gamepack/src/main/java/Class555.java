import io.runebox.ObfInfo;

@ObfInfo(name = "vi")
public class Class555 {
	@ObfInfo(name = "aq", desc = "[I")
	public int[] field5440;
	@ObfInfo(name = "ad", desc = "[S")
	public short[] field5439;

	public Class555(Class184 var1) {
		this.field5440 = new int[8];
		this.field5439 = new short[8];
		int var2 = 0;
		if (var1.method3665()) {
			var2 = var1.method3666().length;
			System.arraycopy(var1.method3666(), 0, this.field5440, 0, var2);
			System.arraycopy(var1.method3668(), 0, this.field5439, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5440[var3] = -1;
			this.field5439[var3] = -1;
		}

	}

	@ObfInfo(name = "aq", desc = "(B)[I")
	public int[] method9743() {
		return this.field5440;
	}

	@ObfInfo(name = "ad", desc = "(I)[S")
	public short[] method9752() {
		return this.field5439;
	}

	@ObfInfo(name = "ag", desc = "(IISB)V")
	public void method9745(int var1, int var2, short var3) {
		this.field5440[var1] = var2;
		this.field5439[var1] = var3;
	}

	@ObfInfo(name = "ak", desc = "([I[SB)V")
	public void method9746(int[] var1, short[] var2) {
		this.field5440 = var1;
		this.field5439 = var2;
	}
}
