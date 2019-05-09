# Message Popup Example
## 1. Text Message
This is the simplest way to show the message, can be error message or anything else.
You only need to set text to TextView or show the TextView that already has the text in it.
 
 ## 2. Toast Message
 The text will be floating below our layout.
 To show the toast message, all you need is call the Toast.makeText() when the action is fired.
 You can set the duration of your toast (Toast.LENGTH_SHORT or Toast.LENGTH_LONG)
 
 ## 3. Dialog Message
 Dialog in android is as same as modal in website. You can put your title, description, and even action to the dialog. But in this example
 we don't use the action. You can make the dialog with AlertDialog.Builder().create() and set anything you want to the object from that instance.
 
 ## 4. Activity Dialog Message
 Basically it is an activity but act as an dialog. The benefit is you can set your own dialog layout and you can control the lifecycle of your dialog. To implement this dialog, you need to tell the AndroidManifest that the activity dialog theme is @android:style/Theme.Dialog
  
    <activity android:name=".DialogActivity"
              android:theme="@android:style/Theme.Dialog"/>

