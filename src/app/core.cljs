(ns app.core
  (:require [rum.core :as rum]
            [cljs.pprint]))

(def state (atom 1))

(def rum-render (atom nil))

(defn render
  [comp]
  (.render @rum-render (comp)))

(rum/defc second-component
   [p1]
   [:Text {:text (str "Hello" p1)}])

(rum/defc app-layout
   []
   [:Column
    [:Column
     {:topPadding 30
      :leftPadding 30
      :spacing 12}
     [:Row
      {:spacing 12}
      [:Button
       {:text (str "OK! " @state)
        :some-shit "123123"
        :onClicked (fn []
                     (println "Clicked!")
                     (swap! state inc)
                     (render app-layout))}]
      [:Button
       {:text "Кнопка 2!"}]]
     (second-component 4)
     [:Image
      {:source "pic.png"
       :width 400
       :height 400
       :fillMode js/Image.PreserveAspectFit}]]])

;(rum/defc app-layout
;   []
;   [:Column
;    {:topPadding 30
;     :leftPadding 30
;     :spacing 12}
;    [:Button
;     {:text (str "OK! " @state)
;      :onClicked (fn []
;                    (println "Clicked! Ахахах!")
;                    (swap! state inc)
;                    (render app-layout))}]
;    (second-component 4)])

(defn ^:export render-main!
  [quick-component]
  (reset! rum-render quick-component)
  (.render quick-component (app-layout)))

'("QtQuick/Font", "QtQuick/Shortcut", "QtQuick/Shortcut",
   "QtQuick/Shortcut", "QtQuick/ColorAnimation",
   "QtQuick/Pinch", "QtQuick/Timer",
   "QtQuick.Controls/SplitView", "QtQuick.Controls.impl/TumblerView",
   "QtQuick/BorderImageMesh", "QtQuick/GradientStop", "QtQuick/AnimationController",
   "QtQuick/RegularExpressionValidator", "QtQuick.Controls/ActionGroup", "QtQuick.Controls/ScrollView",
   "QtQuick.Window/ScreenInfo", "QtQuick.Window/ScreenInfo", "QtQuick/SequentialAnimation", "QtQuick.Controls/SpinBox",
   "QtQuick/Accessible", "QtQuick.Controls/ToolBar", "QtQuick/State", "QtQuick.Controls/Label", "Rum/RumRender",
   "QtQuick/Flow", "QtQuick/Flow", "QtQuick.Controls/Drawer", "QtQuick.Controls/MenuItem", "QtQuick/LoggingCategory",
   "QtQuick/LoggingCategory", "QtQuick/PathAngleArc", "QtQuick/GridMesh", "QtQuick.Controls.impl/DialImpl",
   "QtQuick.Controls.impl/MnemonicLabel", "QtQuick.Controls/ToolTip", "QtQuick.Controls.impl/ColorImage",
   "QtQuick/PathAnimation", "QtQuick.Controls.impl/IconLabel", "QtQuick.Controls.impl/ClippedText", "QtQuick/PathPolyline",
   "QtQuick.Controls/CheckDelegate", "QtQuick.Controls/RoundButton", "QtQuick.Controls.impl/PlaceholderText", "QtQuick/InputMethod",
   "QtQuick/DragHandler", "QtQuick/DragHandler", "QtQuick/Locale", "QtQuick.Controls/ScrollBar", "QtQuick.Controls.impl/Default",
   "QtQuick/TextInput", "QtQuick/TextInput", "QtQuick/TextInput", "QtQuick/TextInput", "QtQuick/TextInput", "QtQuick/TextInput",
   "QtQuick/ShaderEffectMesh", "QtQuick/EnterKey", "QtQuick/Connections", "QtQuick/Connections", "QtQuick/ViewTransition", "QtQuick.Controls/BusyIndicator",
   "QtQuick/SpriteSequence", "QtQuick/PointerEvent", "QtQuick/OpenGLInfo", "QtQuick.Controls/CheckBox", "QtQuick/AnchorChanges", "QtQuick/PathView",
   "QtQuick/PathView", "QtQuick/PathView", "QtQuick.Controls/SwipeView", "QtQuick/Flipable", "QtQuick/NumberAnimation", "QtQuick/ListModel",
   "QtQuick/GridView", "QtQuick/GridView", "QtQuick/GridView", "QtQuick/GridView", "QtQuick.Controls/Button", "QtQuick/FontMetrics",
   "QtQuick.Controls/DelayButton", "QtQuick/PropertyAction", "QtQuick/PathSvg", "QtQuick/Loader", "QtQuick.Controls/DialogButtonBox",
   "QtQuick.Controls/Frame", "QtQuick.Controls/Popup", "QtQuick/Scale", "QtQuick/Rectangle", "QtQuick.Controls/StackView",
   "QtQuick/PathCurve", "QtQuick/PathMultiline", "QtQuick.Controls/Overlay", "QtQuick/VisualItemModel", "QtQuick.Controls/Menu",
   "QtQuick.Controls/TabBar", "QtQuick/AnimatedSprite", "QtQuick/AnimatedSprite", "QtQuick/Canvas", "QtQuick/ScaleAnimator",
   "QtQuick.Controls/PageIndicator", "QtQuick/TableView", "QtQuick/TableView", "QtQuick.Controls/Control",
   "QtQuick.Controls/ToolSeparator", "QtQuick/Drag", "QtQuick.Controls.impl/Color", "QtQuick/SpringAnimation",
   "QtQuick/Grid", "QtQuick/Grid", "QtQuick/Grid", "QtQuick/LayoutMirroring", "QtQuick/Item", "QtQuick/Item",
   "QtQuick/Item", "QtQuick/Item", "QtQuick/Item", "QtQuick.Controls/Slider", "QtQuick.Controls/Page",
   "QtQuick/Flickable", "QtQuick/Flickable", "QtQuick/Flickable", "QtQuick/Flickable", "QtQuick/Flickable",
   "QtQuick/Translate", "QtQuick/Component", "QML/Component", "QtQuick/YAnimator", "QtQuick.Controls/RadioButton",
   "QtQuick.Controls/Dial", "QtQuick.Controls/SwipeDelegate", "QtQuick/ListView", "QtQuick/ListView", "QtQuick/ListView",
   "QtQuick/ListView", "QtQuick/StandardKey", "QtQuick/VisualDataGroup", "QtQuick.Controls.impl/ItemGroup",
   "QtQuick/UniformAnimator", "QtQuick/FontLoader", "QtQuick/EventPoint", "QtQuick/AnchorAnimation",
   "QtQuick.Controls/ComboBox", "QtQuick/Sprite", "QtQuick/KeyNavigation", "QtQuick/ParentAnimation", "QtQuick/Animator",
   "QtQuick/HoverHandler", "QtQuick.Controls/Pane", "QtQuick.Controls.impl/BusyIndicatorImpl", "QtQuick/BorderImage",
   "QtQuick/PauseAnimation", "QtQuick/Behavior", "QtQuick/Behavior", "QtQuick/DropArea", "QtQuick/ImageBase",
   "QtQuick/SmoothedAnimation", "QtQuick/PathLine", "QtQuick/PointerHandler", "QtQuick/Animation", "QtQuick/Animation",
   "QtQuick/PropertyChanges", "QtQuick/Easing", "QtQuick/Rotation", "QtQuick/MultiPointTouchArea", "QtQuick/StateChangeScript",
   "QtQuick.Controls/Switch", "QtQuick/FocusScope", "QtQuick/GestureEvent", "QtQuick/RegExpValidator", "QtQuick/PathCubic",
   "QtQuick/PathMove", "QtQuick/Row", "QtQuick/Row", "QtQuick/Instantiator", "QtQuick/WheelHandler",
   "QtQuick.Controls/RadioDelegate", "QtQuick/XAnimator", "QtQuick/TapHandler", "QtQuick/StateGroup", "QtQuick/WorkerScript",
   "QtQuick.Controls.impl/IconImage", "QtQuick/DragAxis", "QtQuick/DoubleValidator", "QtQuick.Controls/Dialog",
   "QtQuick/Vector3dAnimation", "QtQuick/PinchHandler", "QtQuick/Column", "QtQuick/Column", "QtQuick.Controls/MenuSeparator",
   "QtQuick/ItemView", "QtQuick/ItemView", "QtQuick/ItemView", "QtQuick/ItemView", "QtQuick.Controls/TextField",
   "QtQuick/PathQuad", "QtQuick.Controls.impl/ProgressBarImpl", "QtQuick/PointerScrollEvent", "QtQuick/PropertyAnimation",
   "QtQuick.Controls.impl/PaddedRectangle", "QtQuick/IntValidator", "QtQuick.Controls/AbstractButton",
   "QtQuick.Controls/ButtonGroup", "QtQuick/PointHandler", "QtQuick/Application", "QtQuick/RotationAnimation",
   "QtQuick.Controls/Action", "QtQuick/ShaderEffectSource", "QtQuick/ShaderEffectSource", "QtQuick/ShaderEffectSource",
   "QtQuick/Keys", "QtQuick/VisualDataModel", "QtQuick/ParallelAnimation", "QtQuick/SystemPalette", "QtQuick/MouseArea",
   "QtQuick/MouseArea", "QtQuick/MouseArea", "QtQuick/MouseArea", "QtQuick.Controls/MenuBar", "QtQuick/QtObject",
   "QML/QtObject", "QtQuick/TextEdit", "QtQuick/TextEdit", "QtQuick/TextEdit", "QtQuick/TextEdit", "QtQuick/TextEdit",
   "QtQuick/TextEdit", "QtQuick/TextEdit", "QtQuick/TextEdit", "QtQuick/Binding", "QtQuick/Binding", "QtQuick/ShaderEffect",
   "QtQuick/ShaderEffect", "QtQuick/TouchPoint", "QtQuick/TouchPoint", "QtQuick/PointerMouseEvent", "QtQuick/PathArc",
   "QtQuick/PathArc", "QtQuick/PathPercent", "QtQuick/GraphicsInfo", "QtQuick/Text", "QtQuick/Text", "QtQuick/Text",
   "QtQuick/Text", "QtQuick/Text", "QtQuick/Text", "QtQuick/Text", "QtQuick.Controls/SplitHandle", "QtQuick/EventTouchPoint",
   "QtQuick/Transition", "QtQuick/AnimatedImage", "QtQuick/AnimatedImage", "QtQuick/RotationAnimator",
   "QtQuick.Controls/RangeSlider", "QtQuick.Controls/TabButton", "QtQuick/Repeater", "QtQuick/ListElement",
   "QtQuick.Controls/ApplicationWindow", "QtQuick/PointingDeviceUniqueId", "QtQuick.Controls/MenuBarItem",
   "QtQuick.Window/Screen", "QtQuick.Window/Screen", "QtQuick.Controls/TextArea", "QtQuick.Controls/SwitchDelegate",
   "QtQuick/Matrix4x4", "QtQuick/TextMetrics", "QtQuick/Positioner", "QtQuick/Positioner", "QtQuick/Positioner",
   "QtQuick/Path", "QtQuick/Path", "QtQuick/PointerTouchEvent", "QtQuick.Controls.impl/CheckLabel", "QtQuick.Controls/Tumbler",
   "QtQuick/ParentChange", "QtQuick/PinchArea", "QtQuick/PinchArea", "QtQuick/PathAttribute", "QtQuick/Gradient", "QtQuick/Gradient",
   "QtQuick/ScriptAction", "QtQuick.Controls/GroupBox", "QtQuick.Controls/ItemDelegate", "QtQuick/PaintedItem",
   "QtQuick/PathInterpolator", "QtQuick.Controls/ScrollIndicator", "QtQuick/PointerDevice", "QtQuick/Package", "QtQuick/Image",
   "QtQuick/Image", "QtQuick/Image", "QtQuick/Image", "QtQuick.Controls/ToolButton", "QtQuick.Controls/Container",
   "QtQuick/OpacityAnimator", "QtQuick.Controls/ProgressBar", "QtQuick.Window/Window", "QtQuick.Window/Window", "QtQuick.Window/Window",
   "QtQuick.Window/Window", "QtQuick.Window/Window", "QtQuick/ViewSection")
