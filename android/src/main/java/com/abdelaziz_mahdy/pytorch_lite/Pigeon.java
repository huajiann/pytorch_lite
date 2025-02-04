// Autogenerated from Pigeon (v11.0.1), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.abdelaziz_mahdy.pytorch_lite;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression", "serial"})
public class Pigeon {

  /** Error class for passing custom error details to Flutter via a thrown PlatformException. */
  public static class FlutterError extends RuntimeException {

    /** The error code. */
    public final String code;

    /** The error details. Must be a datatype supported by the api codec. */
    public final Object details;

    public FlutterError(@NonNull String code, @Nullable String message, @Nullable Object details) 
    {
      super(message);
      this.code = code;
      this.details = details;
    }
  }

  @NonNull
  protected static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<Object>(3);
    if (exception instanceof FlutterError) {
      FlutterError error = (FlutterError) exception;
      errorList.add(error.code);
      errorList.add(error.getMessage());
      errorList.add(error.details);
    } else {
      errorList.add(exception.toString());
      errorList.add(exception.getClass().getSimpleName());
      errorList.add(
        "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }
    return errorList;
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class PyTorchRect {
    private @NonNull Double left;

    public @NonNull Double getLeft() {
      return left;
    }

    public void setLeft(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"left\" is null.");
      }
      this.left = setterArg;
    }

    private @NonNull Double top;

    public @NonNull Double getTop() {
      return top;
    }

    public void setTop(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"top\" is null.");
      }
      this.top = setterArg;
    }

    private @NonNull Double right;

    public @NonNull Double getRight() {
      return right;
    }

    public void setRight(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"right\" is null.");
      }
      this.right = setterArg;
    }

    private @NonNull Double bottom;

    public @NonNull Double getBottom() {
      return bottom;
    }

    public void setBottom(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"bottom\" is null.");
      }
      this.bottom = setterArg;
    }

    private @NonNull Double width;

    public @NonNull Double getWidth() {
      return width;
    }

    public void setWidth(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"width\" is null.");
      }
      this.width = setterArg;
    }

    private @NonNull Double height;

    public @NonNull Double getHeight() {
      return height;
    }

    public void setHeight(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"height\" is null.");
      }
      this.height = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    PyTorchRect() {}

    public static final class Builder {

      private @Nullable Double left;

      public @NonNull Builder setLeft(@NonNull Double setterArg) {
        this.left = setterArg;
        return this;
      }

      private @Nullable Double top;

      public @NonNull Builder setTop(@NonNull Double setterArg) {
        this.top = setterArg;
        return this;
      }

      private @Nullable Double right;

      public @NonNull Builder setRight(@NonNull Double setterArg) {
        this.right = setterArg;
        return this;
      }

      private @Nullable Double bottom;

      public @NonNull Builder setBottom(@NonNull Double setterArg) {
        this.bottom = setterArg;
        return this;
      }

      private @Nullable Double width;

      public @NonNull Builder setWidth(@NonNull Double setterArg) {
        this.width = setterArg;
        return this;
      }

      private @Nullable Double height;

      public @NonNull Builder setHeight(@NonNull Double setterArg) {
        this.height = setterArg;
        return this;
      }

      public @NonNull PyTorchRect build() {
        PyTorchRect pigeonReturn = new PyTorchRect();
        pigeonReturn.setLeft(left);
        pigeonReturn.setTop(top);
        pigeonReturn.setRight(right);
        pigeonReturn.setBottom(bottom);
        pigeonReturn.setWidth(width);
        pigeonReturn.setHeight(height);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(6);
      toListResult.add(left);
      toListResult.add(top);
      toListResult.add(right);
      toListResult.add(bottom);
      toListResult.add(width);
      toListResult.add(height);
      return toListResult;
    }

    static @NonNull PyTorchRect fromList(@NonNull ArrayList<Object> list) {
      PyTorchRect pigeonResult = new PyTorchRect();
      Object left = list.get(0);
      pigeonResult.setLeft((Double) left);
      Object top = list.get(1);
      pigeonResult.setTop((Double) top);
      Object right = list.get(2);
      pigeonResult.setRight((Double) right);
      Object bottom = list.get(3);
      pigeonResult.setBottom((Double) bottom);
      Object width = list.get(4);
      pigeonResult.setWidth((Double) width);
      Object height = list.get(5);
      pigeonResult.setHeight((Double) height);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class ResultObjectDetection {
    private @NonNull Long classIndex;

    public @NonNull Long getClassIndex() {
      return classIndex;
    }

    public void setClassIndex(@NonNull Long setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"classIndex\" is null.");
      }
      this.classIndex = setterArg;
    }

    private @Nullable String className;

    public @Nullable String getClassName() {
      return className;
    }

    public void setClassName(@Nullable String setterArg) {
      this.className = setterArg;
    }

    private @NonNull Double score;

    public @NonNull Double getScore() {
      return score;
    }

    public void setScore(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"score\" is null.");
      }
      this.score = setterArg;
    }

    private @NonNull PyTorchRect rect;

    public @NonNull PyTorchRect getRect() {
      return rect;
    }

    public void setRect(@NonNull PyTorchRect setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"rect\" is null.");
      }
      this.rect = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    ResultObjectDetection() {}

    public static final class Builder {

      private @Nullable Long classIndex;

      public @NonNull Builder setClassIndex(@NonNull Long setterArg) {
        this.classIndex = setterArg;
        return this;
      }

      private @Nullable String className;

      public @NonNull Builder setClassName(@Nullable String setterArg) {
        this.className = setterArg;
        return this;
      }

      private @Nullable Double score;

      public @NonNull Builder setScore(@NonNull Double setterArg) {
        this.score = setterArg;
        return this;
      }

      private @Nullable PyTorchRect rect;

      public @NonNull Builder setRect(@NonNull PyTorchRect setterArg) {
        this.rect = setterArg;
        return this;
      }

      public @NonNull ResultObjectDetection build() {
        ResultObjectDetection pigeonReturn = new ResultObjectDetection();
        pigeonReturn.setClassIndex(classIndex);
        pigeonReturn.setClassName(className);
        pigeonReturn.setScore(score);
        pigeonReturn.setRect(rect);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(4);
      toListResult.add(classIndex);
      toListResult.add(className);
      toListResult.add(score);
      toListResult.add((rect == null) ? null : rect.toList());
      return toListResult;
    }

    static @NonNull ResultObjectDetection fromList(@NonNull ArrayList<Object> list) {
      ResultObjectDetection pigeonResult = new ResultObjectDetection();
      Object classIndex = list.get(0);
      pigeonResult.setClassIndex((classIndex == null) ? null : ((classIndex instanceof Integer) ? (Integer) classIndex : (Long) classIndex));
      Object className = list.get(1);
      pigeonResult.setClassName((String) className);
      Object score = list.get(2);
      pigeonResult.setScore((Double) score);
      Object rect = list.get(3);
      pigeonResult.setRect((rect == null) ? null : PyTorchRect.fromList((ArrayList<Object>) rect));
      return pigeonResult;
    }
  }

  public interface Result<T> {
    @SuppressWarnings("UnknownNullness")
    void success(T result);

    void error(@NonNull Throwable error);
  }

  private static class ModelApiCodec extends StandardMessageCodec {
    public static final ModelApiCodec INSTANCE = new ModelApiCodec();

    private ModelApiCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return PyTorchRect.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 129:
          return ResultObjectDetection.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof PyTorchRect) {
        stream.write(128);
        writeValue(stream, ((PyTorchRect) value).toList());
      } else if (value instanceof ResultObjectDetection) {
        stream.write(129);
        writeValue(stream, ((ResultObjectDetection) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface ModelApi {

    void loadModel(@NonNull String modelPath, @Nullable Long numberOfClasses, @Nullable Long imageWidth, @Nullable Long imageHeight, @Nullable Long objectDetectionModelType, @NonNull Result<Long> result);
    /**predicts abstract number input */
    void getPredictionCustom(@NonNull Long index, @NonNull List<Double> input, @NonNull List<Long> shape, @NonNull String dtype, @NonNull Result<List<Object>> result);
    /**predicts raw image but returns the raw net output */
    void getRawImagePredictionList(@NonNull Long index, @NonNull byte[] imageData, @NonNull Boolean isTupleOutput, @NonNull Long tupleIndex, @NonNull Result<List<Double>> result);
    /**predicts raw image but returns the raw net output */
    void getRawImagePredictionListObjectDetection(@NonNull Long index, @NonNull byte[] imageData, @NonNull Double minimumScore, @NonNull Double IOUThreshold, @NonNull Long boxesLimit, @NonNull Boolean isTupleOutput, @NonNull Long tupleIndex, @NonNull Result<List<ResultObjectDetection>> result);
    /**predicts image but returns the raw net output */
    void getImagePredictionList(@NonNull Long index, @Nullable byte[] imageData, @Nullable List<byte[]> imageBytesList, @Nullable Long imageWidthForBytesList, @Nullable Long imageHeightForBytesList, @NonNull List<Double> mean, @NonNull List<Double> std, @NonNull Boolean isTupleOutput, @NonNull Long tupleIndex, @NonNull Result<List<Double>> result);
    /**predicts image but returns the output detections */
    void getImagePredictionListObjectDetection(@NonNull Long index, @Nullable byte[] imageData, @Nullable List<byte[]> imageBytesList, @Nullable Long imageWidthForBytesList, @Nullable Long imageHeightForBytesList, @NonNull Double minimumScore, @NonNull Double IOUThreshold, @NonNull Long boxesLimit, @NonNull Boolean isTupleOutput, @NonNull Long tupleIndex, @NonNull Result<List<ResultObjectDetection>> result);

    /** The codec used by ModelApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return ModelApiCodec.INSTANCE;
    }
    /**Sets up an instance of `ModelApi` to handle messages through the `binaryMessenger`. */
    static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable ModelApi api) {
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.pytorch_lite.ModelApi.loadModel", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String modelPathArg = (String) args.get(0);
                Number numberOfClassesArg = (Number) args.get(1);
                Number imageWidthArg = (Number) args.get(2);
                Number imageHeightArg = (Number) args.get(3);
                Number objectDetectionModelTypeArg = (Number) args.get(4);
                Result<Long> resultCallback =
                    new Result<Long>() {
                      public void success(Long result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.loadModel(modelPathArg, (numberOfClassesArg == null) ? null : numberOfClassesArg.longValue(), (imageWidthArg == null) ? null : imageWidthArg.longValue(), (imageHeightArg == null) ? null : imageHeightArg.longValue(), (objectDetectionModelTypeArg == null) ? null : objectDetectionModelTypeArg.longValue(), resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.pytorch_lite.ModelApi.getPredictionCustom", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                Number indexArg = (Number) args.get(0);
                List<Double> inputArg = (List<Double>) args.get(1);
                List<Long> shapeArg = (List<Long>) args.get(2);
                String dtypeArg = (String) args.get(3);
                Result<List<Object>> resultCallback =
                    new Result<List<Object>>() {
                      public void success(List<Object> result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getPredictionCustom((indexArg == null) ? null : indexArg.longValue(), inputArg, shapeArg, dtypeArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.pytorch_lite.ModelApi.getRawImagePredictionList", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                Number indexArg = (Number) args.get(0);
                byte[] imageDataArg = (byte[]) args.get(1);
                Boolean isTupleOutputArg = (Boolean) args.get(2);
                Number tupleIndexArg = (Number) args.get(3);
                Result<List<Double>> resultCallback =
                    new Result<List<Double>>() {
                      public void success(List<Double> result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getRawImagePredictionList((indexArg == null) ? null : indexArg.longValue(), imageDataArg, isTupleOutputArg, (tupleIndexArg == null) ? null : tupleIndexArg.longValue(), resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.pytorch_lite.ModelApi.getRawImagePredictionListObjectDetection", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                Number indexArg = (Number) args.get(0);
                byte[] imageDataArg = (byte[]) args.get(1);
                Double minimumScoreArg = (Double) args.get(2);
                Double IOUThresholdArg = (Double) args.get(3);
                Number boxesLimitArg = (Number) args.get(4);
                Boolean isTupleOutputArg = (Boolean) args.get(5);
                Number tupleIndexArg = (Number) args.get(6);
                Result<List<ResultObjectDetection>> resultCallback =
                    new Result<List<ResultObjectDetection>>() {
                      public void success(List<ResultObjectDetection> result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getRawImagePredictionListObjectDetection((indexArg == null) ? null : indexArg.longValue(), imageDataArg, minimumScoreArg, IOUThresholdArg, (boxesLimitArg == null) ? null : boxesLimitArg.longValue(), isTupleOutputArg, (tupleIndexArg == null) ? null : tupleIndexArg.longValue(), resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.pytorch_lite.ModelApi.getImagePredictionList", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                Number indexArg = (Number) args.get(0);
                byte[] imageDataArg = (byte[]) args.get(1);
                List<byte[]> imageBytesListArg = (List<byte[]>) args.get(2);
                Number imageWidthForBytesListArg = (Number) args.get(3);
                Number imageHeightForBytesListArg = (Number) args.get(4);
                List<Double> meanArg = (List<Double>) args.get(5);
                List<Double> stdArg = (List<Double>) args.get(6);
                Boolean isTupleOutputArg = (Boolean) args.get(7);
                Number tupleIndexArg = (Number) args.get(8);
                Result<List<Double>> resultCallback =
                    new Result<List<Double>>() {
                      public void success(List<Double> result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getImagePredictionList((indexArg == null) ? null : indexArg.longValue(), imageDataArg, imageBytesListArg, (imageWidthForBytesListArg == null) ? null : imageWidthForBytesListArg.longValue(), (imageHeightForBytesListArg == null) ? null : imageHeightForBytesListArg.longValue(), meanArg, stdArg, isTupleOutputArg, (tupleIndexArg == null) ? null : tupleIndexArg.longValue(), resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.pytorch_lite.ModelApi.getImagePredictionListObjectDetection", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                Number indexArg = (Number) args.get(0);
                byte[] imageDataArg = (byte[]) args.get(1);
                List<byte[]> imageBytesListArg = (List<byte[]>) args.get(2);
                Number imageWidthForBytesListArg = (Number) args.get(3);
                Number imageHeightForBytesListArg = (Number) args.get(4);
                Double minimumScoreArg = (Double) args.get(5);
                Double IOUThresholdArg = (Double) args.get(6);
                Number boxesLimitArg = (Number) args.get(7);
                Boolean isTupleOutputArg = (Boolean) args.get(8);
                Number tupleIndexArg = (Number) args.get(9);
                Result<List<ResultObjectDetection>> resultCallback =
                    new Result<List<ResultObjectDetection>>() {
                      public void success(List<ResultObjectDetection> result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getImagePredictionListObjectDetection((indexArg == null) ? null : indexArg.longValue(), imageDataArg, imageBytesListArg, (imageWidthForBytesListArg == null) ? null : imageWidthForBytesListArg.longValue(), (imageHeightForBytesListArg == null) ? null : imageHeightForBytesListArg.longValue(), minimumScoreArg, IOUThresholdArg, (boxesLimitArg == null) ? null : boxesLimitArg.longValue(), isTupleOutputArg, (tupleIndexArg == null) ? null : tupleIndexArg.longValue(), resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
}
