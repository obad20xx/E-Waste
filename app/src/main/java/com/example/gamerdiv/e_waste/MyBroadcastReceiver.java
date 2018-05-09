package com.example.gamerdiv.e_waste;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.widget.Toast;


public class MyBroadcastReceiver extends BroadcastReceiver {

    public static int Id=0;


    @Override
    public void onReceive(Context context, Intent intent) {

        if(Id==10)
            Id=0;

        String [] a ={"إذا قمنا بتجميع مليون هاتف نقال من المخلفات الإلكترونية فإننا نستطيع ان نحصل على 30 كجم من الذهاب و 327 الف كجم من الفضة و 15 كجم من البلاديوم واكثر من 15 الف كجم من النحاس وهذا يعادل اكثر من 2 مليون دولار من المواد الخام",
                "عارفين ان البلاستيك اللي في الكابلات بيحتوي على مادة اسمها بولي كلوريد الفينيل يؤدي إلى تلف جهاز المناعة و عند حرقها تنتج مادة الديوكسين اللتي تسبب مشاكل الإنجاب ",
                "تعرف ان انت ممكن تستخدم اللابتوب التالف كشاشة تلفزيون أو شاشة للكمبيوتر المكتبي و بكدا تكون ساعدت العالم كله فى الحد من زيادة نسبة المخلفات الالكترونية",
                "هل تعلم ان نصف كيلو واحد من الرامات ينتج حوالي 1جرام من الذهب وان كمية الذهب التي توجد داخل الهاتف تعادل 1دولار امريكي",
                "حيث أن الفضاء مجمع للنفايات ومقبرة الخردوات واقمار صناعية منتهية الصلاحية وبقايا الصواريخ المحطمة لتشكل حطاما فضائيًا حيث ان هذة المخلفات تعتبر ضمن المخلفات الإلكترونية وتعادل 10 آلاآف طن من النفايات الناجمة عن الإنسان وتشكل خطر كبير على الكوكب",
                "تستخدم بطاريات الزئبق في العديد من الأجهزة الإلكترونية مثل الساعات اليدوية ولعب الأطفال \n" +
                        "وبسبب صغر حجم هذا النوع من البطاريات يجعل ابتلاعها سهل جدا لأي طفل وإذا لم يتم اسعاف الطفل في أقرب وقت من الابتلاع يكون عرضه لكثير من الامراض مثل الفشل الكلوي وغيرها لذالك ينصح بالتخلص من البطاريات القديمة بعيدا عن الاطفال",
                "هل تعلم أنه يمكن استخراج المعادن الثمينة من المخلفات الإلكترونية مثل الذهب والفضة، وأن 6 آلاف تليفون محمول تحتوي على معادن ثمينة بما يعادل 111 ألف جنيه ",
                "البطاريات قنابل موقوتة داخل المخلفات الإلكترونية احرص على التخلص منها بشكل سليم",
                "احذر ان يضع طفلك بطارية في فمة لانه سيصاب بالتسمم",
                "هل تعلم انه إذا دفنت شرائط الكاسيت و الفيديو تحت الأرض فإنك ستتلف المياه والتربة المحيطة لانها تحتوي على الكروميوم وهو حديد سام فلا تعامل هذة الشرائط كنفايات",
                "يرى خبراء الاقتصاد ان سوق إعادة تدوير الأجهزة الإلكترونية سوق واعدة حيث أن تكلفة استخراج المعادن منها أقل 10 مرات من استخراجها من المناجم الطبيعية"
        };
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.icon)
                        .setContentTitle("E-Waste")
                        .setContentText(a[Id]);
        Intent resultIntent = new Intent(context, info.class);
        resultIntent.putExtra("inf",a[Id]);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addParentStack(info.class);
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(
                        0,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(Id, mBuilder.build());
        Id++;
        Toast.makeText(context, "Notification...."+Id, Toast.LENGTH_LONG).show();

    }


}
