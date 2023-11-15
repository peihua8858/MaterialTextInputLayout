:heartpulse:**MaterialTextInputLayout**:heartpulse:

**MaterialTextInputLayout** 是一个提供修改后的 `TextInputLayout` 的库
来自 Google 的 [[Android 材料组件](https://github.com/material-components/material-components-android)]。
也就是说，它提供了一个具有概述的“EditText”的组件
提示和错误，但不剪掉边框。

[![Jitpack](https://jitpack.io/v/peihua8858/MaterialTextInputLayout.svg)](https://github.com/peihua8858)
[![PRs Welcome](https://img.shields.io/badge/PRs-Welcome-brightgreen.svg)](https://github.com/peihua8858)
[![Star](https://img.shields.io/github/stars/peihua8858/MaterialTextInputLayout.svg)](https://github.com/peihua8858/MaterialTextInputLayout)


## 目录
-[最新版本](https://github.com/peihua8858/MaterialTextInputLayout/releases/tag/1.0.0)<br>
-[如何引用](#如何引用)<br>
-[进阶使用](#进阶使用)<br>
-[如何提Issues](https://github.com/peihua8858/MaterialTextInputLayout/wiki/%E5%A6%82%E4%BD%95%E6%8F%90Issues%3F)<br>
-[License](#License)<br>


## 如何引用

* 把 `maven { url 'https://jitpack.io' }` 加入到 repositories 中
* 添加如下依赖，末尾的「latestVersion」指的是MaterialTextInputLayout [![Download](https://jitpack.io/v/peihua8858/MaterialTextInputLayout.svg)](https://jitpack.io/#peihua8858/MaterialTextInputLayout) 里的版本名称，请自行替换。

使用 Gradle

```sh
repositories {
  google()
  maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.peihua8858:MaterialTextInputLayout:${latestVersion}'
}
```

或 Maven:

```xml
<dependency>
  <groupId>com.github.peihua8858</groupId>
  <artifactId>MaterialTextInputLayout</artifactId>
  <version>${latestVersion}</version>
</dependency>
```

## 进阶使用
### 1、xml 布局引入
```XML
<com.peihua.inputlayout.textfield.TextInputLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginStart="16dp"
    android:layout_marginTop="16dp"
    android:layout_marginEnd="16dp"
    android:layout_marginBottom="16dp"
    android:hint="Username"
    app:boxBackgroundColor="@color/colorOnBackground"
    app:boxBackgroundMode="outline"
    app:boxCornerRadiusBottomEnd="8dp"
    app:boxCornerRadiusBottomStart="8dp"
    app:boxCornerRadiusTopEnd="8dp"
    app:boxCornerRadiusTopStart="8dp"
    app:boxStrokeColor="@color/input_stroke"
    app:boxStrokeWidth="0dp"
    app:boxStrokeWidthFocused="1dp"
    app:hintEnabled="true"
    app:hideHintCutout="true"
    app:hintErrorEnabled="true"
    app:hintPaddingTop="12dp"
    app:hintTextAppearance="@style/TextAppearance.Design.Hint">

    <com.peihua.inputlayout.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@null"
        android:paddingStart="16dp"
        android:paddingTop="28dp"
        android:paddingBottom="16dp"
        android:singleLine="true" />
</com.peihua.inputlayout.textfield.TextInputLayout>
```
### 2、 自定义属性说明
仅对新增属性说明，其他请查看Google 的 [[Android TextInputLayout](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/textfield/res/values/attrs.xml)]
属性名 | 说明 | 默认值
:----------- | :----------- | :-----------
isFixedExpand         | 是否固定展开暗纹        | false
hideHintCutout         | 是否隐藏缺口        | true
hintErrorEnabled         | 显示错误时，暗纹颜色是否与错误颜色一致，true表示一直，false 则保持不变        | true

## 演示效果

|          示例        | 
|:----------------------:|
| ![](assets/sample.png) |

## License

```sh
Copyright 2023 peihua

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
