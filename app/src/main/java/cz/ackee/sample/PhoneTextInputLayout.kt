package cz.ackee.sample

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.isVisible
import com.fz.common.utils.getDrawableCompat
import com.fz.common.view.utils.setDrawableEnd
import com.fz.common.view.utils.setOnNoDoubleClickListener
import com.fz.common.view.utils.sp2px
import com.peihua.inputlayout.textfield.TextInputLayout

class PhoneTextInputLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : TextInputLayout(context, attrs, defStyleAttr) {
    private val areaCodeTextView: TextView
    private val carrierNumberView: TextView

    init {
        areaCodeTextView = TextView(context)
        areaCodeTextView.setTextColor(Color.BLACK)
        areaCodeTextView.textSize = 12f
        areaCodeTextView.isVisible = true
        areaCodeTextView.text = "+86"
        carrierNumberView = TextView(context)
        carrierNumberView.setTextColor(Color.BLACK)
        carrierNumberView.textSize = 12f
        carrierNumberView.text = "+898"
        val arrowDownDrawable = context.getDrawableCompat(R.mipmap.ic_arrow_down)
        arrowDownDrawable?.setTint(Color.BLACK)
        carrierNumberView.isVisible = true
        carrierNumberView.compoundDrawablePadding = 16
        carrierNumberView.setDrawableEnd(arrowDownDrawable)
        carrierNumberView.setOnNoDoubleClickListener {
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        val starView = LinearLayout(context)
        starView.orientation = HORIZONTAL
        starView.gravity = Gravity.CENTER_VERTICAL
        starView.addView(areaCodeTextView, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        starView.addView(carrierNumberView, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        setStartLayout(starView, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
//        setFixedExpand(true)
    }
}