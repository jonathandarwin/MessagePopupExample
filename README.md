# Message Popup Example
## 1. Text Message
This is the simplest way to show the message, can be error message or anything else.
You only need to set text to TextView or show the TextView that already has the text in it.

<image width="30%" height="30%" src="https://user-images.githubusercontent.com/48744669/57427205-23316a00-724d-11e9-9ff0-37599e04fec4.png"/>
 
 ## 2. Toast Message
 The text will be floating below our layout.
 To show the toast message, all you need is call the Toast.makeText() when the action is fired.
 You can set the duration of your toast (Toast.LENGTH_SHORT or Toast.LENGTH_LONG)
 
<image width="30%" height="30%" src="https://user-images.githubusercontent.com/48744669/57427211-23ca0080-724d-11e9-8a50-a1316638e2d7.png"/>
 
 ## 3. Dialog Message
 Dialog in android is as same as modal in website. You can put your title, description, and even action to the dialog. But in this example
 we don't use the action. You can make the dialog with AlertDialog.Builder().create() and set anything you want to the object from that instance.
 
<image width="30%" height="30%" src="https://user-images.githubusercontent.com/48744669/57427212-24629700-724d-11e9-8e41-cd6e1a4af502.png"/>
 
 ## 4. Activity Dialog Message
 Basically it is an activity but act as an dialog. The benefit is you can set your own dialog layout and you can control the lifecycle of your dialog. To implement this dialog, you need to tell the AndroidManifest that the activity dialog theme is @android:style/Theme.Dialog
  
    <activity android:name=".DialogActivity"
              android:theme="@android:style/Theme.Dialog"/>
and in the activity dialog, you need to extend your activity with 'Activity' class

     public class DialogActivity extends Activity {
        ....
     }

You can delete the title bar by using this line of code above setContentView():

     requestWindowFeature(Window.FEATURE_NO_TITLE);

<image width="30%" height="30%" src="https://user-images.githubusercontent.com/48744669/57427213-24629700-724d-11e9-9fb4-0c4660b6adef.png"/>
     
## 5. Snackbar Message
Snackbar is a kind of dialog but appear at the bottom of your screen. You can set the duration of your snackbar. So i'll say that snackbar is the combination of dialog + toast.

<image width="30%" height="30%" src="https://user-images.githubusercontent.com/48744669/57427214-24fb2d80-724d-11e9-9cd3-e195b91646c5.png"/>

## 6. Action Snackbar Message
You can set the action to the snackbar. But remember that when you want user give an certain action to snackbar, you should set the duration with Snackbar.LENGTH_INDEFINITE so the snackbar won't disappear until the user do some action.

     Snackbar snackbar = Snackbar.make(binding.llContainer, "Action snackbar", Snackbar.LENGTH_INDEFINITE)

To handle the action, we use setAction() method :
   
     .setAction("Ok", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Snackbar snackbar = Snackbar.make(binding.llContainer, "Okay!", Snackbar.LENGTH_SHORT);
                            snackbar.show();
                        }
                    });

<image width="30%" height="30%" src="https://user-images.githubusercontent.com/48744669/57427205-23316a00-724d-11e9-9ff0-37599e04fec4.png"/>

<image width="30%" height="30%" src="https://user-images.githubusercontent.com/48744669/57427207-23316a00-724d-11e9-995a-822ed1fdec71.png"/>
