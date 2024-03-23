# DependencyInjectionSample

## 概要

DIコンテナについて学ぶ。  
DI(Dependency Injection)とは依存性の注入のこと。  
インスタンス生成に「new」を使わずにフレームワークを活用する。  
これがを可能にするのがDIコンテナである。  
Spring Frameworkには、任意に実装したクラスをインスタンス化する機能を提供している。  
つまり、Spring Frameworkには、DIコンテナの機能を有する。  

## 依存性を低くするためのルール

- インターフェースを利用して依存関係を作る。  
- インスタンスを明示的に生成しない。
- アノテーションをクラスに付与する。
- Spring Frameworkにインスタンス生成させる。
- インスタンスを利用したいか所でアノテーションを付与する。

## ソ－スコードの説明

1. Spring Frameworkが起動時に、対象プロジェクトのパッケージをすべてスキャン（コンポーネントスキャン）。
2. 「@Component」アノテーションが付与されているクラスのインスタンスを生成。
3. 「@Autowired」アノテーションに従い、生成されたインスタンスが、Spring Boot起動のクラスのフィールドに注入。
4. フィールド上で使用インスタンスのメソッドが実行される。

> 1. コンポーネントスキャン  
> 2. 「@Component」アノテーションが付いた、chapter03.usedパッケージの、MorningGreet(あるいはEveningGreet)クラスのインスタンスを生成。  
> 3. 「@Autowired」アノテーションに従い、MorningGreetクラスのインスタンスが、DependencyInjectionSampleApplicationクラスのgreetフィールドに注入。  
> 4. MorningGreetクラスのgreetingメソッドが実行される。
