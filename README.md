# Taiwan-administrative-area-for-android
可以取得台灣行政區物件的簡易Library。
可以讓使用者在UI上點選自己所在的城鎮。
只支援行政區的兩個層級。
例如「屏東縣潮州鎮」、「台北市中正區」
此專案設計用來讓人輸入住址用。

把這個project編譯起來，會產生可讓其他專案可匯入的aar檔案。

用法：
1.在自己的專案之中拉出兩個TextView。
第一個用來顯示縣市層級，第二個顯示鄉鎮等級。
2.建立TaiwanAreaManager物件，範例如下：

	private TaiwanAreaManager manager;
	manager = new TaiwanAreaManager(getContext());

	@Override
	public void onStart() {
		super.onStart();
		manager.initTextView(textView1, textView2);
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		manager.onDestroy();
	}

另外選擇完畢之後
可用以下兩種function取出資訊：
	String str = manager.getUserSelectLocation();
	int postNumber = manager.getPostNumber();
