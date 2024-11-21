package school;
// お掃除インターフェース
 interface CleaningMethod {
    void clean();
}

//ほうきで掃除するクラス
 class BroomCleaning implements CleaningMethod {
  @Override
  public void clean() {
      System.out.println("ほうきで掃いて掃除します");
  }
}

//モップで掃除するクラス
 class MopCleaning implements CleaningMethod {
  @Override
  public void clean() {
      System.out.println("モップで拭いて掃除します");
  }
}

//掃除機で掃除するクラス
 class VacuumCleaning implements CleaningMethod {
  @Override
  public void clean() {
      System.out.println("掃除機で吸って掃除します");
  }
}

  class CleaningRobot {
	    private CleaningMethod cleaningMethod;

	    // コンストラクタで掃除方法を指定
	    public CleaningRobot(CleaningMethod cleaningMethod) {
	        this.cleaningMethod = cleaningMethod;
	    }

	    // 掃除実行
	    public void startCleaning() {
	        cleaningMethod.clean();
	    }

	    public static void main(String[] args) {
	        // ほうきで掃除するロボット
	        CleaningRobot broomRobot = new CleaningRobot(new BroomCleaning());
	        broomRobot.startCleaning(); // 出力: ほうきで掃いて掃除します

	        // モップで掃除するロボット
	        CleaningRobot mopRobot = new CleaningRobot(new MopCleaning());
	        mopRobot.startCleaning(); // 出力: モップで拭いて掃除します

	        // 掃除機で掃除するロボット
	        CleaningRobot vacuumRobot = new CleaningRobot(new VacuumCleaning());
	        vacuumRobot.startCleaning(); // 出力: 掃除機で吸って掃除します
	    }
	}
