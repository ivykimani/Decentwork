# Compose Preview Guide

## ✅ Previews Added to All Screens!

All screen files now have `@Preview` functions so you can see them in Android Studio's preview pane.

## Available Previews

### HomeScreen.kt
- `HomeScreenPreview()` - Full home screen with all sections

### JobsScreen.kt
- `JobsScreenPreview()` - Job listings screen
- `JobCardPreview()` - Individual job card

### IndicatorsScreen.kt
- `IndicatorsScreenPreview()` - Economic indicators screen
- `IndicatorCardPreview()` - Individual indicator card

### RightsScreen.kt
- `RightsScreenPreview()` - Worker rights screen
- `RightCardPreview()` - Individual right card

### ResourcesScreen.kt
- `ResourcesScreenPreview()` - Career resources screen
- `ResourceCardPreview()` - Individual resource card

## How to View Previews in Android Studio

### Method 1: Split View
1. Open any screen file (e.g., `HomeScreen.kt`)
2. Look for the **"Split"** button in the top-right corner
3. Click it to see code on left, preview on right
4. Or click **"Design"** to see only the preview

### Method 2: Preview Panel
1. Open any screen file
2. Go to **View → Tool Windows → Preview**
3. The preview panel will appear on the right
4. You'll see all `@Preview` functions in that file

### Method 3: Gutter Icons
1. Open any screen file
2. Look for the small Android icon (▶️) next to `@Preview` functions
3. Click it to open the preview

## Preview Features

### Interactive Mode
- Click the **"Interactive"** button in preview toolbar
- You can click buttons and interact with the UI
- Great for testing without running the app

### Device Selection
- Click the device dropdown in preview toolbar
- Choose different devices (Pixel, Tablet, etc.)
- See how your UI looks on different screen sizes

### Multiple Previews
- Each file can have multiple `@Preview` functions
- Scroll through the preview panel to see all of them
- Useful for seeing different states

## Troubleshooting Previews

### Preview Not Showing

**Solution 1: Build the Project**
```
Build → Make Project (Ctrl+F9 / Cmd+F9)
```

**Solution 2: Refresh Preview**
- Click the refresh icon (🔄) in preview toolbar
- Or press Ctrl+Shift+F5 (Cmd+Shift+F5 on Mac)

**Solution 3: Invalidate Caches**
```
File → Invalidate Caches / Restart
Select "Invalidate and Restart"
```

### Preview Shows Error

**Check for:**
- Syntax errors in the file
- Missing imports
- Unresolved references
- Build errors

**Fix:**
1. Check the error message in preview panel
2. Fix any red underlines in code
3. Build the project
4. Refresh preview

### Preview is Slow

**Solutions:**
- Close other preview panels
- Reduce number of `@Preview` functions
- Use `@Preview(showSystemUi = false)` for faster rendering
- Increase Android Studio memory in Help → Edit Custom VM Options

## Preview Annotations

### Basic Preview
```kotlin
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    DecentworkTheme {
        MyComposable()
    }
}
```

### Full Screen Preview
```kotlin
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyScreenPreview() {
    DecentworkTheme {
        MyScreen()
    }
}
```

### Multiple Device Previews
```kotlin
@Preview(name = "Phone", device = "spec:width=411dp,height=891dp")
@Preview(name = "Tablet", device = "spec:width=1280dp,height=800dp")
@Composable
fun MyResponsivePreview() {
    DecentworkTheme {
        MyComposable()
    }
}
```

### Dark Mode Preview
```kotlin
@Preview(name = "Light Mode", showBackground = true)
@Preview(name = "Dark Mode", showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun MyThemePreview() {
    DecentworkTheme {
        MyComposable()
    }
}
```

## Best Practices

### 1. Always Wrap in Theme
```kotlin
@Preview
@Composable
fun MyPreview() {
    DecentworkTheme {  // ✅ Always use theme
        MyComposable()
    }
}
```

### 2. Use Descriptive Names
```kotlin
@Preview(name = "Job Card - Remote Position")  // ✅ Clear name
@Composable
fun JobCardRemotePreview() { ... }
```

### 3. Preview Different States
```kotlin
@Preview(name = "Empty State")
@Composable
fun EmptyStatePreview() { ... }

@Preview(name = "Loading State")
@Composable
fun LoadingStatePreview() { ... }

@Preview(name = "Success State")
@Composable
fun SuccessStatePreview() { ... }
```

### 4. Use Sample Data
```kotlin
@Preview
@Composable
fun JobCardPreview() {
    DecentworkTheme {
        JobCard(
            job = Job(  // ✅ Use realistic sample data
                id = 1,
                title = "Software Developer",
                // ... other fields
            ),
            onClick = {}
        )
    }
}
```

## Benefits of Previews

✅ **Faster Development**
- See changes instantly without running the app
- No need to navigate to the screen

✅ **Multiple States**
- Preview different UI states side by side
- Test edge cases easily

✅ **Different Devices**
- See how UI looks on phones, tablets, foldables
- Test responsive layouts

✅ **Design Validation**
- Share previews with designers
- Verify implementation matches designs

✅ **Accessibility Testing**
- Preview with large fonts
- Test different color schemes

## Keyboard Shortcuts

- **Refresh Preview**: Ctrl+Shift+F5 (Cmd+Shift+F5)
- **Build Project**: Ctrl+F9 (Cmd+F9)
- **Toggle Split/Design**: Alt+Shift+Left/Right
- **Interactive Mode**: Click toolbar button

## Tips

1. **Keep previews simple** - Complex previews slow down rendering
2. **Use preview parameters** - Test different configurations
3. **Preview individual components** - Easier to debug
4. **Use interactive mode** - Test interactions without running app
5. **Preview on multiple devices** - Ensure responsive design

## Common Issues

### "Render Problem"
- Build the project
- Check for syntax errors
- Verify all imports

### "Preview Out of Date"
- Click refresh button
- Build project
- Check if file has unsaved changes

### "No Preview Available"
- Ensure function has `@Preview` annotation
- Verify function is `@Composable`
- Check that function has no parameters

## Next Steps

Now that previews are working:
1. Open any screen file
2. Click "Split" or "Design" view
3. See your UI instantly
4. Make changes and watch them update
5. Use interactive mode to test interactions

Happy previewing! 🎨
